package androidx.compose.material.icons.rounded;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsActiveKt {
    private static ImageVector _notificationsActive;

    public static final ImageVector getNotificationsActive(Icons.Rounded rounded) {
        ImageVector imageVector = _notificationsActive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotificationsActive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(18.0f, 16.0f, -5.0f);
        h.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        h.lineTo(13.5f, 4.0f);
        h.curveToRelative(0.0f, -0.83f, -0.68f, -1.5f, -1.51f, -1.5f);
        h.reflectiveCurveTo(10.5f, 3.17f, 10.5f, 4.0f);
        h.verticalLineToRelative(0.68f);
        h.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        h.verticalLineToRelative(5.0f);
        h.lineToRelative(-1.3f, 1.29f);
        h.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        h.horizontalLineToRelative(13.17f);
        h.curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        uo.l(h, 18.0f, 16.0f, 11.99f, 22.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.horizontalLineToRelative(-4.0f);
        h.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        h.close();
        h.moveTo(6.77f, 4.73f);
        h.curveToRelative(0.42f, -0.38f, 0.43f, -1.03f, 0.03f, -1.43f);
        h.curveToRelative(-0.38f, -0.38f, -1.0f, -0.39f, -1.39f, -0.02f);
        h.curveTo(3.7f, 4.84f, 2.52f, 6.96f, 2.14f, 9.34f);
        h.curveToRelative(-0.09f, 0.61f, 0.38f, 1.16f, 1.0f, 1.16f);
        h.curveToRelative(0.48f, 0.0f, 0.9f, -0.35f, 0.98f, -0.83f);
        h.curveToRelative(0.3f, -1.94f, 1.26f, -3.67f, 2.65f, -4.94f);
        h.close();
        h.moveTo(18.6f, 3.28f);
        h.curveToRelative(-0.4f, -0.37f, -1.02f, -0.36f, -1.4f, 0.02f);
        h.curveToRelative(-0.4f, 0.4f, -0.38f, 1.04f, 0.03f, 1.42f);
        h.curveToRelative(1.38f, 1.27f, 2.35f, 3.0f, 2.65f, 4.94f);
        h.curveToRelative(0.07f, 0.48f, 0.49f, 0.83f, 0.98f, 0.83f);
        h.curveToRelative(0.61f, 0.0f, 1.09f, -0.55f, 0.99f, -1.16f);
        h.curveToRelative(-0.38f, -2.37f, -1.55f, -4.48f, -3.25f, -6.05f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsActive = build;
        build.getClass();
        return build;
    }
}
