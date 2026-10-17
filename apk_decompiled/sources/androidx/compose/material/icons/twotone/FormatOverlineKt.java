package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatOverlineKt {
    private static ImageVector _formatOverline;

    public static final ImageVector getFormatOverline(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatOverline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatOverline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(19.0f, 3.0f, 2.0f, 5.0f, 3.0f);
        k4.w(y, 19.0f, 12.0f, 7.0f);
        y.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        y.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        y.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        y.curveTo(19.0f, 10.13f, 15.87f, 7.0f, 12.0f, 7.0f);
        y.close();
        y.moveTo(12.0f, 18.5f);
        y.curveToRelative(-2.49f, 0.0f, -4.5f, -2.01f, -4.5f, -4.5f);
        y.reflectiveCurveTo(9.51f, 9.5f, 12.0f, 9.5f);
        y.reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(y, 14.49f, 18.5f, 12.0f, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatOverline = build;
        build.getClass();
        return build;
    }
}
