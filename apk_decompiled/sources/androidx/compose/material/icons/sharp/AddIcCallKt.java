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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddIcCallKt {
    private static ImageVector _addIcCall;

    public static final ImageVector getAddIcCall(Icons.Sharp sharp) {
        ImageVector imageVector = _addIcCall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AddIcCall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(21.0f, 6.0f, -3.0f, 18.0f, 3.0f);
        af0.v(p, -2.0f, 3.0f, -3.0f, 2.0f);
        kf0.x(p, 3.0f, 3.0f, 2.0f);
        uf.j(p, 18.0f, 8.0f, 3.0f);
        p.moveTo(21.0f, 15.46f);
        p.lineToRelative(-5.27f, -0.61f);
        p.lineToRelative(-2.52f, 2.52f);
        p.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        p.lineToRelative(2.53f, -2.53f);
        p.lineTo(8.54f, 3.0f);
        p.lineTo(3.03f, 3.0f);
        p.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, -5.51f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addIcCall = build;
        build.getClass();
        return build;
    }
}
