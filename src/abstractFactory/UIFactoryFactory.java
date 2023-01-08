package abstractFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFActoryForPlatform(SupportedPlatform platform){
        return switch (platform){
            case IOS -> new IOSFactory();
            case ANDROID -> new AndroidFactory();
        };
    }
}
