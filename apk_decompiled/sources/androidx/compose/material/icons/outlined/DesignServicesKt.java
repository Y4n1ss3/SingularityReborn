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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DesignServicesKt {
    private static ImageVector _designServices;

    public static final ImageVector getDesignServices(Icons.Outlined outlined) {
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DesignServices", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.97f, 7.27f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(-2.83f, -2.83f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(-4.49f, 4.49f);
        b.lineTo(8.35f, 3.63f);
        b.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        b.lineToRelative(-1.9f, 1.9f);
        b.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        b.lineToRelative(3.89f, 3.89f);
        fc.t(b, 3.0f, 16.76f, 21.0f, 4.24f);
        b.lineToRelative(4.52f, -4.52f);
        b.lineToRelative(3.89f, 3.89f);
        b.curveToRelative(0.95f, 0.95f, 2.23f, 0.6f, 2.83f, 0.0f);
        b.lineToRelative(1.9f, -1.9f);
        b.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        gy.B(b, -3.89f, -3.89f, 20.97f, 7.27f);
        b.moveTo(5.04f, 6.94f);
        b.lineToRelative(1.89f, -1.9f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.lineToRelative(1.27f, 1.27f);
        b.lineTo(7.02f, 7.5f);
        b.lineToRelative(1.41f, 1.41f);
        b.lineToRelative(1.19f, -1.19f);
        b.lineToRelative(1.2f, 1.2f);
        gy.B(b, -1.9f, 1.9f, 5.04f, 6.94f);
        b.moveTo(16.27f, 14.38f);
        b.lineToRelative(-1.19f, 1.19f);
        b.lineToRelative(1.41f, 1.41f);
        b.lineToRelative(1.19f, -1.19f);
        b.lineToRelative(1.27f, 1.27f);
        b.lineToRelative(-1.9f, 1.9f);
        b.lineToRelative(-3.89f, -3.89f);
        gy.B(b, 1.9f, -1.9f, 16.27f, 14.38f);
        k4.A(b, 6.41f, 19.0f, 5.0f, -1.41f);
        b.lineToRelative(9.61f, -9.61f);
        b.lineToRelative(1.3f, 1.3f);
        gy.B(b, 0.11f, 0.11f, 6.41f, 19.0f);
        b.moveTo(16.02f, 6.56f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(1.41f, 1.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -1.41f, 1.41f, 16.02f, 6.56f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _designServices = build;
        build.getClass();
        return build;
    }
}
