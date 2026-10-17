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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Filled filled) {
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LinkOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(17.0f, 7.0f, -4.0f, 1.9f, 4.0f);
        n.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        n.curveToRelative(0.0f, 1.43f, -0.98f, 2.63f, -2.31f, 2.98f);
        n.lineToRelative(1.46f, 1.46f);
        n.curveTo(20.88f, 15.61f, 22.0f, 13.95f, 22.0f, 12.0f);
        n.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        af0.l(n, 16.0f, 11.0f, -2.19f);
        gy.B(n, 2.0f, 2.0f, 16.0f, 13.0f);
        n.moveTo(2.0f, 4.27f);
        n.lineToRelative(3.11f, 3.11f);
        n.curveTo(3.29f, 8.12f, 2.0f, 9.91f, 2.0f, 12.0f);
        n.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        bv.C(n, 4.0f, -1.9f, 7.0f, 15.1f);
        n.curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        n.curveToRelative(0.0f, -1.59f, 1.21f, -2.9f, 2.76f, -3.07f);
        n.lineTo(8.73f, 11.0f);
        af0.m(n, 8.0f, 11.0f, 2.0f, 2.73f);
        n.lineTo(13.0f, 15.27f);
        n.lineTo(13.0f, 17.0f);
        n.horizontalLineToRelative(1.73f);
        n.lineToRelative(4.01f, 4.0f);
        n.lineTo(20.0f, 19.74f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(n, 3.27f, 3.0f, 2.0f, 4.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = build;
        build.getClass();
        return build;
    }
}
