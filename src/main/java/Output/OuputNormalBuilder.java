package Output;

import java.io.*;

public class OuputNormalBuilder implements OutputBuilder{
    toStyle toStyle;
    String fileName;

    public OuputNormalBuilder(toStyle toStyle, String fileName) {
        this.toStyle = toStyle;
        this.fileName = fileName;
    }

    private OutputStream createOutputStream() throws FileNotFoundException {
        return new FileOutputStream(fileName);
    }

    @Override
    public void Build() throws IOException {
        OutputStream fileStream = createOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(fileStream, "UTF-8");
        writer.append(toStyle.toOutput());
        writer.close();
        fileStream.close();
    }
}
