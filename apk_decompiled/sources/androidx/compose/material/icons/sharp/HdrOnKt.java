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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrOnKt {
    private static ImageVector _hdrOn;

    public static final ImageVector getHdrOn(Icons.Sharp sharp) {
        ImageVector imageVector = _hdrOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HdrOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(21.0f, 12.9f, 21.0f, 9.0f, -5.0f);
        r6.D(k, 6.0f, 1.5f, -2.0f, 1.1f);
        k.lineToRelative(0.9f, 2.0f);
        k.lineTo(21.0f, 15.0f);
        uf.r(k, -0.9f, -2.1f, 0.9f);
        k4.C(k, 19.5f, 11.5f, -2.0f, -1.0f);
        fc.x(k, 2.0f, 1.0f, 6.5f, 11.0f);
        k.horizontalLineToRelative(-2.0f);
        k.lineTo(4.5f, 9.0f);
        af0.m(k, 3.0f, 9.0f, 6.0f, 1.5f);
        uo.B(k, -2.5f, 2.0f, 6.5f, 15.0f);
        k.lineTo(8.0f, 15.0f);
        k.lineTo(8.0f, 9.0f);
        bv.r(k, 6.5f, 9.0f, 2.0f);
        k.moveTo(13.0f, 9.0f);
        k.lineTo(9.5f, 9.0f);
        k.verticalLineToRelative(6.0f);
        k.lineTo(13.0f, 15.0f);
        k.curveToRelative(0.8f, 0.0f, 1.5f, -0.7f, 1.5f, -1.5f);
        k.verticalLineToRelative(-3.0f);
        k.curveToRelative(0.0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f);
        r6.B(k, 13.0f, 13.5f, -2.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(k, 2.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrOn = build;
        build.getClass();
        return build;
    }
}
