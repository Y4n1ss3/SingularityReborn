package androidx.compose.material.icons.sharp;

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
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsActiveKt {
    private static ImageVector _notificationsActive;

    public static final ImageVector getNotificationsActive(Icons.Sharp sharp) {
        ImageVector imageVector = _notificationsActive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NotificationsActive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.58f, 4.08f, 6.15f, 2.65f);
        i.curveTo(3.75f, 4.48f, 2.17f, 7.3f, 2.03f, 10.5f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.15f, -2.65f, 1.51f, -4.97f, 3.55f, -6.42f);
        af0.l(i, 19.97f, 10.5f, 2.0f);
        i.curveToRelative(-0.15f, -3.2f, -1.73f, -6.02f, -4.12f, -7.85f);
        i.lineToRelative(-1.42f, 1.43f);
        i.curveToRelative(2.02f, 1.45f, 3.39f, 3.77f, 3.54f, 6.42f);
        i.close();
        i.moveTo(18.0f, 11.0f);
        i.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        fc.w(i, 13.5f, 2.5f, -3.0f, 2.18f);
        i.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        j50.A(i, 5.0f, -2.0f, 2.0f, 1.0f);
        bv.p(i, 16.0f, -1.0f, -2.0f, -2.0f);
        r6.l(i, -5.0f, 12.0f, 22.0f);
        i.curveToRelative(0.14f, 0.0f, 0.27f, -0.01f, 0.4f, -0.04f);
        i.curveToRelative(0.65f, -0.14f, 1.18f, -0.58f, 1.44f, -1.18f);
        i.curveToRelative(0.1f, -0.24f, 0.15f, -0.5f, 0.15f, -0.78f);
        i.horizontalLineToRelative(-4.0f);
        i.curveToRelative(0.01f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsActive = build;
        build.getClass();
        return build;
    }
}
