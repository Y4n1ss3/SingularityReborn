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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsActiveKt {
    private static ImageVector _notificationsActive;

    public static final ImageVector getNotificationsActive(Icons.Outlined outlined) {
        ImageVector imageVector = _notificationsActive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NotificationsActive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.v(b, 18.0f, 16.0f, -5.0f);
        b.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        b.lineTo(13.5f, 4.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b.verticalLineToRelative(0.68f);
        b.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        j50.A(b, 5.0f, -2.0f, 2.0f, 1.0f);
        j50.u(b, 16.0f, -1.0f, -2.0f, -2.0f);
        b.moveTo(16.0f, 17.0f);
        b.lineTo(8.0f, 17.0f);
        b.verticalLineToRelative(-6.0f);
        b.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        b.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        r6.l(b, 6.0f, 7.58f, 4.08f);
        b.lineTo(6.15f, 2.65f);
        b.curveTo(3.75f, 4.48f, 2.17f, 7.3f, 2.03f, 10.5f);
        b.horizontalLineToRelative(2.0f);
        b.curveToRelative(0.15f, -2.65f, 1.51f, -4.97f, 3.55f, -6.42f);
        af0.l(b, 19.97f, 10.5f, 2.0f);
        b.curveToRelative(-0.15f, -3.2f, -1.73f, -6.02f, -4.12f, -7.85f);
        b.lineToRelative(-1.42f, 1.43f);
        b.curveToRelative(2.02f, 1.45f, 3.39f, 3.77f, 3.54f, 6.42f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsActive = build;
        build.getClass();
        return build;
    }
}
