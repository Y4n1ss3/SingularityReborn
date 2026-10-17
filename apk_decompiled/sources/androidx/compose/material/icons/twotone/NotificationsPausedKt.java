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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsPausedKt {
    private static ImageVector _notificationsPaused;

    public static final ImageVector getNotificationsPaused(Icons.TwoTone twoTone) {
        ImageVector imageVector = _notificationsPaused;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NotificationsPaused", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.5f);
        b.curveToRelative(-2.49f, 0.0f, -4.0f, 2.02f, -4.0f, 4.5f);
        kf0.z(b, 6.0f, 8.0f, -6.0f);
        b.curveToRelative(0.0f, -2.48f, -1.51f, -4.5f, -4.0f, -4.5f);
        k4.x(b, 14.5f, 9.8f, -2.8f, 3.4f);
        uo.n(b, 2.8f, 14.5f, 15.0f, -5.0f);
        b.verticalLineToRelative(-1.8f);
        b.lineToRelative(2.8f, -3.4f);
        b.lineTo(9.5f, 9.8f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(b, 9.5f, 8.0f, 5.0f, 1.8f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(9.5f, 9.8f, 2.8f, -2.8f, 3.4f);
        fc.w(i, 9.5f, 15.0f, 5.0f, -1.8f);
        i.horizontalLineToRelative(-2.8f);
        i.lineToRelative(2.8f, -3.4f);
        uf.j(i, 14.5f, 8.0f, -5.0f);
        i.moveTo(18.0f, 16.0f);
        i.verticalLineToRelative(-5.0f);
        i.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        i.lineTo(13.5f, 4.0f);
        i.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        i.verticalLineToRelative(0.68f);
        i.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        j50.A(i, 5.0f, -2.0f, 2.0f, 1.0f);
        j50.u(i, 16.0f, -1.0f, -2.0f, -2.0f);
        i.moveTo(16.0f, 17.0f);
        i.lineTo(8.0f, 17.0f);
        i.verticalLineToRelative(-6.0f);
        i.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        i.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        r6.l(i, 6.0f, 12.0f, 22.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.horizontalLineToRelative(-4.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsPaused = build;
        build.getClass();
        return build;
    }
}
