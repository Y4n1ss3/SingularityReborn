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
import defpackage.fc;
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsOffKt {
    private static ImageVector _notificationsOff;

    public static final ImageVector getNotificationsOff(Icons.Sharp sharp) {
        ImageVector imageVector = _notificationsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NotificationsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        b.close();
        b.moveTo(18.0f, 11.0f);
        b.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        fc.w(b, 13.5f, 2.5f, -3.0f, 2.18f);
        b.curveToRelative(-0.24f, 0.06f, -0.47f, 0.15f, -0.69f, 0.23f);
        r6.C(b, 18.0f, 13.1f, 18.0f, 11.0f);
        b.moveTo(5.41f, 3.35f);
        b.lineTo(4.0f, 4.76f);
        b.lineToRelative(2.81f, 2.81f);
        b.curveTo(6.29f, 8.57f, 6.0f, 9.73f, 6.0f, 11.0f);
        j50.A(b, 5.0f, -2.0f, 2.0f, 1.0f);
        b.horizontalLineToRelative(14.24f);
        b.lineToRelative(1.74f, 1.74f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.41f, -1.41f, 5.41f, 3.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsOff = build;
        build.getClass();
        return build;
    }
}
