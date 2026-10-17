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
import defpackage.af0;
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommuteKt {
    private static ImageVector _commute;

    public static final ImageVector getCommute(Icons.TwoTone twoTone) {
        ImageVector imageVector = _commute;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Commute", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 4.0f, 5.0f, 4.0f);
        i.curveTo(3.34f, 4.0f, 2.0f, 5.34f, 2.0f, 7.0f);
        i.verticalLineToRelative(8.0f);
        i.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        r6.A(i, -1.0f, 1.0f, 1.0f, 1.0f);
        r6.q(i, 2.0f, -2.0f, 2.0f, -5.0f);
        i.lineTo(4.0f, 13.0f);
        fc.w(i, 4.0f, 6.0f, 9.0f, 2.0f);
        i.horizontalLineToRelative(2.0f);
        i.lineTo(15.0f, 7.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        i.close();
        i.moveTo(5.0f, 14.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.close();
        i.moveTo(20.57f, 9.66f);
        i.curveToRelative(-0.14f, -0.4f, -0.52f, -0.66f, -0.97f, -0.66f);
        i.horizontalLineToRelative(-7.19f);
        i.curveToRelative(-0.46f, 0.0f, -0.83f, 0.26f, -0.98f, 0.66f);
        i.lineToRelative(-1.42f, 4.11f);
        i.verticalLineToRelative(5.51f);
        i.curveToRelative(0.0f, 0.38f, 0.31f, 0.72f, 0.69f, 0.72f);
        i.horizontalLineToRelative(0.62f);
        i.curveToRelative(0.38f, 0.0f, 0.68f, -0.38f, 0.68f, -0.76f);
        fc.w(i, 12.0f, 18.0f, 8.0f, 1.24f);
        i.curveToRelative(0.0f, 0.38f, 0.31f, 0.76f, 0.69f, 0.76f);
        i.horizontalLineToRelative(0.61f);
        i.curveToRelative(0.38f, 0.0f, 0.69f, -0.34f, 0.69f, -0.72f);
        i.lineToRelative(0.01f, -1.37f);
        uo.t(i, -4.14f, -1.43f, -4.11f);
        i.moveTo(12.41f, 10.0f);
        kf0.B(i, 7.19f, 1.03f, 3.0f, -9.25f);
        fc.B(i, 1.03f, -3.0f, 12.0f, 16.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        i.close();
        i.moveTo(20.0f, 16.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.45f, 1.0f, -1.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _commute = build;
        build.getClass();
        return build;
    }
}
