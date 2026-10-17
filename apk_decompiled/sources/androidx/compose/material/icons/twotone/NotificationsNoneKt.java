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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsNoneKt {
    private static ImageVector _notificationsNone;

    public static final ImageVector getNotificationsNone(Icons.TwoTone twoTone) {
        ImageVector imageVector = _notificationsNone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NotificationsNone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(18.0f, 16.0f, -5.0f);
        h.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        h.lineTo(13.5f, 4.0f);
        h.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        h.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        h.verticalLineToRelative(0.68f);
        h.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        j50.A(h, 5.0f, -2.0f, 2.0f, 1.0f);
        j50.u(h, 16.0f, -1.0f, -2.0f, -2.0f);
        h.moveTo(16.0f, 17.0f);
        h.lineTo(8.0f, 17.0f);
        h.verticalLineToRelative(-6.0f);
        h.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        h.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        r6.l(h, 6.0f, 12.0f, 22.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.horizontalLineToRelative(-4.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsNone = build;
        build.getClass();
        return build;
    }
}
