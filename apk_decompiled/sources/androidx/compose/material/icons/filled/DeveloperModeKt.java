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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeveloperModeKt {
    private static ImageVector _developerMode;

    public static final ImageVector getDeveloperMode(Icons.Filled filled) {
        ImageVector imageVector = _developerMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DeveloperMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(7.0f, 5.0f, 10.0f, 2.0f, 2.0f);
        n.lineTo(19.0f, 3.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        n.lineTo(7.0f, 1.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.D(n, 4.0f, 2.0f, 7.0f, 5.0f);
        n.moveTo(15.41f, 16.59f);
        n.lineTo(20.0f, 12.0f);
        n.lineToRelative(-4.59f, -4.59f);
        n.lineTo(14.0f, 8.83f);
        n.lineTo(17.17f, 12.0f);
        bv.o(n, 14.0f, 15.17f, 1.41f, 1.42f);
        n.moveTo(10.0f, 15.17f);
        n.lineTo(6.83f, 12.0f);
        n.lineTo(10.0f, 8.83f);
        n.lineTo(8.59f, 7.41f);
        n.lineTo(4.0f, 12.0f);
        gy.B(n, 4.59f, 4.59f, 10.0f, 15.17f);
        n.moveTo(17.0f, 19.0f);
        n.lineTo(7.0f, 19.0f);
        bv.q(n, -2.0f, 5.0f, 17.0f, 4.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(10.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(n, -4.0f, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerMode = build;
        build.getClass();
        return build;
    }
}
