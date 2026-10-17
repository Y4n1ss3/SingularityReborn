package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BusAlertKt {
    private static ImageVector _busAlert;

    public static final ImageVector getBusAlert(Icons.Filled filled) {
        ImageVector imageVector = _busAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BusAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 1.0f);
        b.arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.78f, 3.05f);
        b.lineToRelative(0.02f, -0.03f);
        b.curveTo(9.84f, 4.0f, 9.42f, 4.0f, 9.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        b.lineTo(2.0f, 22.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        kf0.z(b, -1.0f, 8.0f, 1.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.78f);
        b.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        b.verticalLineToRelative(-3.08f);
        b.arcTo(7.0f, 7.0f, 0.0f, false, false, 16.0f, 1.0f);
        b.close();
        b.moveTo(4.5f, 19.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        k4.r(b, 3.0f, 13.0f, 3.0f, 8.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 1.96f, 0.81f, 3.73f, 2.11f, 5.0f);
        uo.l(b, 3.0f, 13.0f, 13.5f, 19.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        b.close();
        b.moveTo(16.0f, 13.0f);
        b.arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f);
        b.arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f);
        r6.B(b, 15.0f, 4.0f, 2.0f, 5.0f);
        kp0.A(b, -2.0f, 15.0f, 10.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(b, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _busAlert = build;
        build.getClass();
        return build;
    }
}
