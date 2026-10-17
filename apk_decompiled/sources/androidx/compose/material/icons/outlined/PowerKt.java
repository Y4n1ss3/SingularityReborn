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
import defpackage.fc;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerKt {
    private static ImageVector _power;

    public static final ImageVector getPower(Icons.Outlined outlined) {
        ImageVector imageVector = _power;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Power", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(16.0f, 9.0f, 4.66f, -3.5f, 3.51f);
        kf0.r(n, 19.0f, -1.0f, -1.83f);
        fc.t(n, 8.0f, 13.65f, 9.0f, 8.0f);
        n.moveToRelative(0.0f, -6.0f);
        n.horizontalLineToRelative(-2.0f);
        n.verticalLineToRelative(4.0f);
        af0.p(n, -4.0f, 3.0f, 8.0f, 4.0f);
        n.horizontalLineToRelative(-0.01f);
        n.curveTo(6.9f, 6.99f, 6.0f, 7.89f, 6.0f, 8.98f);
        bv.q(n, 5.52f, 9.5f, 18.0f, 3.0f);
        bv.p(n, 5.0f, -3.0f, 3.5f, -3.51f);
        n.verticalLineTo(9.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(n, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _power = build;
        build.getClass();
        return build;
    }
}
