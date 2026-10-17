package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidFontKt {
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m7119FontEj4NQ78(File file, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m7121FontEj4NQ78$default(File file, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = FontVariation.INSTANCE.m7195Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m7119FontEj4NQ78(file, fontWeight, i, settings);
    }

    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m7122FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m7123FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 8) != 0) {
            i = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        if ((i2 & 16) != 0) {
            settings = FontVariation.INSTANCE.m7195Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m7122FontMuC2MFs(str, assetManager, fontWeight, i, settings);
    }

    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m7118FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i, settings, null);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m7120FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m7179getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = FontVariation.INSTANCE.m7195Settings6EWAqTQ(fontWeight, i, new FontVariation.Setting[0]);
        }
        return m7118FontEj4NQ78(parcelFileDescriptor, fontWeight, i, settings);
    }
}
