package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChairKt {
    private static ImageVector _chair;

    public static final ImageVector getChair(Icons.Outlined outlined) {
        ImageVector imageVector = _chair;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Chair", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(20.0f, 8.0f, 6.0f);
        d.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        d.horizontalLineTo(7.0f);
        d.curveTo(5.35f, 3.0f, 4.0f, 4.35f, 4.0f, 6.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        d.verticalLineToRelative(5.0f);
        d.curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f);
        d.verticalLineToRelative(1.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        kf0.z(d, -1.0f, 12.0f, 1.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(-1.0f);
        d.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        d.verticalLineToRelative(-5.0f);
        d.curveTo(23.0f, 9.35f, 21.65f, 8.0f, 20.0f, 8.0f);
        d.close();
        d.moveTo(6.0f, 6.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(10.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(2.78f);
        d.curveToRelative(-0.61f, 0.55f, -1.0f, 1.34f, -1.0f, 2.22f);
        r6.s(d, 2.0f, 7.0f, -2.0f);
        d.curveToRelative(0.0f, -0.88f, -0.39f, -1.67f, -1.0f, -2.22f);
        bv.t(d, 6.0f, 21.0f, 16.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-5.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        kf0.z(d, 4.0f, 14.0f, -4.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chair = build;
        build.getClass();
        return build;
    }
}
