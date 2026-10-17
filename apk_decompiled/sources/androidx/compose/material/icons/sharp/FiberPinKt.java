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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberPinKt {
    private static ImageVector _fiberPin;

    public static final ImageVector getFiberPin(Icons.Sharp sharp) {
        ImageVector imageVector = _fiberPin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberPin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(5.5f, 10.5f, 2.0f, 1.0f, -2.0f);
        r6.l(n, -1.0f, 22.0f, 4.0f);
        af0.m(n, 2.0f, 4.0f, 16.0f, 20.0f);
        uo.l(n, 22.0f, 4.0f, 9.0f, 13.0f);
        n.lineTo(5.5f, 13.0f);
        n.verticalLineToRelative(2.0f);
        n.lineTo(4.0f, 15.0f);
        r6.m(n, 4.0f, 9.0f, 5.0f, 4.0f);
        n.moveTo(12.5f, 15.0f);
        n.lineTo(11.0f, 15.0f);
        r6.m(n, 11.0f, 9.0f, 1.5f, 6.0f);
        n.moveTo(20.0f, 15.0f);
        n.horizontalLineToRelative(-1.2f);
        n.lineToRelative(-2.55f, -3.5f);
        n.lineTo(16.25f, 15.0f);
        n.lineTo(15.0f, 15.0f);
        n.lineTo(15.0f, 9.0f);
        n.horizontalLineToRelative(1.25f);
        n.lineToRelative(2.5f, 3.5f);
        n.lineTo(18.75f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(n, 20.0f, 9.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberPin = build;
        build.getClass();
        return build;
    }
}
