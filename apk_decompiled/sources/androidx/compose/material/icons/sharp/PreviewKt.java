package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PreviewKt {
    private static ImageVector _preview;

    public static final ImageVector getPreview(Icons.Sharp sharp) {
        ImageVector imageVector = _preview;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Preview", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(3.0f, 3.0f, 18.0f, 18.0f, 3.0f);
        kp0.B(w, 3.0f, 19.0f, 19.0f, 5.0f);
        c21.c(w, 7.0f, 14.0f, 19.0f);
        w.moveTo(13.5f, 13.0f);
        w.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        w.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        w.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        w.reflectiveCurveTo(13.5f, 12.17f, 13.5f, 13.0f);
        w.close();
        w.moveTo(12.0f, 9.0f);
        w.curveToRelative(-2.73f, 0.0f, -5.06f, 1.66f, -6.0f, 4.0f);
        w.curveToRelative(0.94f, 2.34f, 3.27f, 4.0f, 6.0f, 4.0f);
        w.reflectiveCurveToRelative(5.06f, -1.66f, 6.0f, -4.0f);
        w.curveTo(17.06f, 10.66f, 14.73f, 9.0f, 12.0f, 9.0f);
        w.close();
        w.moveTo(12.0f, 15.5f);
        w.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        w.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        w.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        w.curveTo(14.5f, 14.38f, 13.38f, 15.5f, 12.0f, 15.5f);
        w.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, w.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _preview = build;
        build.getClass();
        return build;
    }
}
