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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClosedCaptionDisabledKt {
    private static ImageVector _closedCaptionDisabled;

    public static final ImageVector getClosedCaptionDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _closedCaptionDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ClosedCaptionDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.0f, 10.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        r6.D(b, 1.0f, -1.5f, -0.5f, -2.0f);
        kf0.t(b, 1.0f, 13.0f, 10.0f);
        b.moveTo(16.5f, 13.5f);
        b.lineToRelative(1.21f, 1.21f);
        b.curveTo(17.89f, 14.52f, 18.0f, 14.27f, 18.0f, 14.0f);
        k4.p(b, -1.0f, -1.5f, 13.5f);
        k4.A(b, 8.83f, 6.0f, 19.0f, 10.17f);
        b.lineToRelative(1.98f, 1.98f);
        b.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.16f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.m(b, 6.83f, 8.83f, 6.0f);
        b.moveTo(19.78f, 22.61f);
        b.lineTo(17.17f, 20.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, 18.38f, 18.38f, 19.78f, 22.61f);
        j50.y(b, 7.5f, 13.5f, 2.0f, 13.0f);
        r6.t(b, 0.67f, -2.5f, -2.5f, 7.5f);
        bv.t(b, 13.5f, 15.17f, 18.0f);
        b.lineTo(11.0f, 13.83f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(7.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.32f, 0.16f, -0.59f, 0.4f, -0.78f);
        b.lineTo(5.0f, 7.83f);
        b.verticalLineTo(18.0f);
        b.horizontalLineTo(15.17f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closedCaptionDisabled = build;
        build.getClass();
        return build;
    }
}
