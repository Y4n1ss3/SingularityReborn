package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveCircleOutlineKt {
    private static ImageVector _removeCircleOutline;

    public static final ImageVector getRemoveCircleOutline(Icons.Filled filled) {
        ImageVector imageVector = _removeCircleOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RemoveCircleOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(7.0f, 11.0f, 2.0f, 10.0f, -2.0f);
        uo.l(s, 7.0f, 11.0f, 12.0f, 2.0f);
        s.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        s.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        s.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        s.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        s.close();
        s.moveTo(12.0f, 20.0f);
        s.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        s.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        s.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(s, -3.59f, 8.0f, -8.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeCircleOutline = build;
        build.getClass();
        return build;
    }
}
