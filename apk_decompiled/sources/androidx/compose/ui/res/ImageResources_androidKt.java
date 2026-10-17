package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i2, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Resources resources = (Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources());
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        TypedValue typedValue = (TypedValue) rememberedValue;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean changed = composer.changed(charSequence.toString());
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = imageResource(companion, resources, i);
            composer.updateRememberedValue(rememberedValue2);
        }
        ImageBitmap imageBitmap = (ImageBitmap) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageBitmap;
    }

    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }
}
