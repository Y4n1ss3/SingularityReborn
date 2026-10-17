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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CottageKt {
    private static ImageVector _cottage;

    public static final ImageVector getCottage(Icons.Sharp sharp) {
        ImageVector imageVector = _cottage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Cottage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(12.0f, 3.0f, 6.0f, 7.58f, 6.0f);
        u.horizontalLineTo(4.0f);
        u.verticalLineToRelative(3.11f);
        u.lineTo(1.0f, 11.4f);
        u.lineToRelative(1.21f, 1.59f);
        fc.t(u, 4.0f, 11.62f, 21.0f, 7.0f);
        r6.D(u, -6.0f, 2.0f, 6.0f, 7.0f);
        u.verticalLineToRelative(-9.38f);
        u.lineToRelative(1.79f, 1.36f);
        r6.C(u, 23.0f, 11.4f, 12.0f, 3.0f);
        u.moveTo(10.0f, 1.0f);
        u.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        u.curveTo(6.45f, 4.0f, 6.0f, 4.45f, 6.0f, 5.0f);
        u.horizontalLineTo(4.0f);
        u.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        u.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(u, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cottage = build;
        build.getClass();
        return build;
    }
}
