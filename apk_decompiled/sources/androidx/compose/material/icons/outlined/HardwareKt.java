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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HardwareKt {
    private static ImageVector _hardware;

    public static final ImageVector getHardware(Icons.Outlined outlined) {
        ImageVector imageVector = _hardware;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Hardware", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(18.0f, 3.0f, -3.0f, 3.0f, 3.0f);
        j.horizontalLineTo(9.0f);
        j.curveTo(6.24f, 3.0f, 4.0f, 5.24f, 4.0f, 8.0f);
        j.horizontalLineToRelative(5.0f);
        j.verticalLineToRelative(12.0f);
        j.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        j.horizontalLineToRelative(4.0f);
        j.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        j.verticalLineTo(8.0f);
        j.lineToRelative(3.0f, 3.0f);
        j.horizontalLineToRelative(2.0f);
        bv.z(j, 3.0f, 18.0f, 13.0f, 19.0f);
        bv.l(j, -2.0f, -6.0f, 2.0f, 19.0f);
        kp0.C(j, 11.0f, 11.0f, 6.0f, 6.77f);
        j.curveTo(7.32f, 5.39f, 8.11f, 5.0f, 9.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.m(j, 4.0f, 6.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hardware = build;
        build.getClass();
        return build;
    }
}
