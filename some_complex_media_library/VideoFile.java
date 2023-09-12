package some_complex_media_library;

public class VideoFile {
    private String name;
    private String CodecType;

    public VideoFile(String name) {
        this.name = name;
        this.CodecType = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return CodecType;
    }

    public String getName() {
        return name;
    }
}