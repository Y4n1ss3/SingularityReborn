package defpackage;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g11 implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ g11(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        IntSize IntSizeToVector$lambda$1;
        AnimationVector4D RectToVector$lambda$0;
        Rect RectToVector$lambda$1;
        float value;
        w01 measure_3p2s80s$lambda$0;
        WindowInsets safeGestures;
        WindowInsets systemGestures;
        WindowInsets displayCutout;
        WindowInsets safeContent;
        WindowInsets mandatorySystemGestures;
        WindowInsets ime;
        WindowInsets systemBars;
        WindowInsets navigationBars;
        WindowInsets safeDrawing;
        WindowInsets captionBar;
        WindowInsets waterfall;
        WindowInsets statusBars;
        switch (this.d) {
            case 0:
                IntSizeToVector$lambda$1 = VectorConvertersKt.IntSizeToVector$lambda$1((AnimationVector2D) obj);
                return IntSizeToVector$lambda$1;
            case 1:
                RectToVector$lambda$0 = VectorConvertersKt.RectToVector$lambda$0((Rect) obj);
                return RectToVector$lambda$0;
            case 2:
                RectToVector$lambda$1 = VectorConvertersKt.RectToVector$lambda$1((AnimationVector4D) obj);
                return RectToVector$lambda$1;
            case 3:
                value = ((AnimationVector1D) obj).getValue();
                return Float.valueOf(value);
            case 4:
                measure_3p2s80s$lambda$0 = WideNavigationRailKt$WideNavigationRailLayout$1.AnonymousClass2.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            case 5:
                safeGestures = ((WindowInsetsHolder) obj).getSafeGestures();
                return safeGestures;
            case 6:
                systemGestures = ((WindowInsetsHolder) obj).getSystemGestures();
                return systemGestures;
            case 7:
                displayCutout = ((WindowInsetsHolder) obj).getDisplayCutout();
                return displayCutout;
            case 8:
                safeContent = ((WindowInsetsHolder) obj).getSafeContent();
                return safeContent;
            case 9:
                mandatorySystemGestures = ((WindowInsetsHolder) obj).getMandatorySystemGestures();
                return mandatorySystemGestures;
            case 10:
                ime = ((WindowInsetsHolder) obj).getIme();
                return ime;
            case 11:
                systemBars = ((WindowInsetsHolder) obj).getSystemBars();
                return systemBars;
            case Matrix.TranslateX /* 12 */:
                navigationBars = ((WindowInsetsHolder) obj).getNavigationBars();
                return navigationBars;
            case Matrix.TranslateY /* 13 */:
                safeDrawing = ((WindowInsetsHolder) obj).getSafeDrawing();
                return safeDrawing;
            case Matrix.TranslateZ /* 14 */:
                captionBar = ((WindowInsetsHolder) obj).getCaptionBar();
                return captionBar;
            case 15:
                waterfall = ((WindowInsetsHolder) obj).getWaterfall();
                return waterfall;
            case 16:
                statusBars = ((WindowInsetsHolder) obj).getStatusBars();
                return statusBars;
            default:
                w31 w31Var = (w31) obj;
                w31Var.getClass();
                return w31Var;
        }
    }
}
