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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TempleBuddhistKt {
    private static ImageVector _templeBuddhist;

    public static final ImageVector getTempleBuddhist(Icons.Outlined outlined) {
        ImageVector imageVector = _templeBuddhist;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TempleBuddhist", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 9.02f);
        b.curveToRelative(0.0f, 1.09f, -0.89f, 1.98f, -1.98f, 1.98f);
        b.horizontalLineTo(18.0f);
        b.verticalLineTo(8.86f);
        b.curveToRelative(1.72f, -0.44f, 3.0f, -1.99f, 3.0f, -3.84f);
        b.verticalLineTo(5.0f);
        b.lineToRelative(-2.0f, 0.02f);
        b.curveTo(19.0f, 6.11f, 18.11f, 7.0f, 17.02f, 7.0f);
        b.horizontalLineTo(16.5f);
        b.lineTo(12.0f, 1.0f);
        b.lineTo(7.5f, 7.0f);
        b.horizontalLineTo(6.98f);
        b.curveTo(5.89f, 7.0f, 5.0f, 6.11f, 5.0f, 5.02f);
        b.horizontalLineTo(3.0f);
        b.curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f);
        b.verticalLineTo(11.0f);
        b.horizontalLineTo(4.98f);
        b.curveTo(3.89f, 11.0f, 3.0f, 10.11f, 3.0f, 9.02f);
        b.horizontalLineTo(1.0f);
        b.curveToRelative(0.0f, 1.86f, 1.28f, 3.4f, 3.0f, 3.84f);
        kf0.r(b, 22.0f, 7.0f, -4.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        kf0.z(b, 4.0f, 7.0f, -9.14f);
        b.curveToRelative(1.72f, -0.44f, 3.0f, -1.99f, 3.0f, -3.84f);
        bv.k(b, 9.0f, 21.0f, 9.02f);
        b.moveTo(12.0f, 4.33f);
        b.lineTo(14.0f, 7.0f);
        gy.n(b, -4.0f, 12.0f, 4.33f);
        k4.C(b, 8.0f, 9.0f, 8.0f, 2.0f);
        bv.s(b, 8.0f, 9.0f, 18.0f, 20.0f);
        b.horizontalLineToRelative(-3.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        af0.B(b, 2.0f, 6.0f, -7.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _templeBuddhist = build;
        build.getClass();
        return build;
    }
}
