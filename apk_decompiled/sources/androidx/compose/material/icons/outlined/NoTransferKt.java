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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoTransferKt {
    private static ImageVector _noTransfer;

    public static final ImageVector getNoTransfer(Icons.Outlined outlined) {
        ImageVector imageVector = _noTransfer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NoTransfer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.5f, 13.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(9.33f, 16.0f, 8.5f, 16.0f);
        b.reflectiveCurveTo(7.0f, 15.33f, 7.0f, 14.5f);
        b.reflectiveCurveTo(7.67f, 13.0f, 8.5f, 13.0f);
        k4.x(b, 19.78f, 22.61f, -1.64f, -1.64f);
        b.curveTo(18.09f, 20.98f, 18.05f, 21.0f, 18.0f, 21.0f);
        b.horizontalLineToRelative(-1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        r6.s(b, -1.0f, 8.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-1.78f);
        b.curveTo(4.39f, 17.67f, 4.0f, 16.88f, 4.0f, 16.0f);
        b.verticalLineTo(6.83f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, 18.38f, 18.38f, 19.78f, 22.61f);
        kp0.t(b, 6.0f, 8.83f, 10.0f, 1.17f);
        uo.l(b, 6.0f, 8.83f, 14.17f, 17.0f);
        j50.x(b, -5.0f, -5.0f, 6.0f, 4.0f);
        b.curveToRelative(0.0f, 0.37f, 0.21f, 0.62f, 0.34f, 0.73f);
        kf0.h(b, 6.63f, 17.0f, 14.17f);
        b.moveTo(12.0f, 4.0f);
        b.curveToRelative(3.69f, 0.0f, 5.11f, 0.46f, 5.66f, 0.99f);
        fc.z(b, 7.82f, 2.0f, 2.0f, 18.0f);
        uo.u(b, 10.0f, -5.17f, 2.0f, 2.0f);
        k4.q(b, 18.0f, 3.17f, 1.81f, 1.81f);
        b.curveTo(19.92f, 16.67f, 20.0f, 16.35f, 20.0f, 16.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f);
        b.curveTo(9.48f, 2.0f, 7.24f, 2.16f, 5.78f, 2.95f);
        b.lineToRelative(1.53f, 1.53f);
        b.curveTo(8.17f, 4.2f, 9.6f, 4.0f, 12.0f, 4.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noTransfer = build;
        build.getClass();
        return build;
    }
}
