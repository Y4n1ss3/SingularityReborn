package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import defpackage.o;
import java.io.File;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else {
            if (settings.getNeedsDensity$ui_text()) {
                o.f("Required density, but not provided");
                return null;
            }
            Density = DensityKt.Density(1.0f, 1.0f);
        }
        return PlatformFontVariationSettings_androidKt.toAndroidArray(settings, Density, PlatformFontVariationSettings_androidKt.getFontWeightAdjustment(context));
    }

    public final android.graphics.Typeface createFromAssets(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    public final android.graphics.Typeface createFromFile(File file, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    public final android.graphics.Typeface createFromFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }
}
