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
public final class FiberDvrKt {
    private static ImageVector _fiberDvr;

    public static final ImageVector getFiberDvr(Icons.Sharp sharp) {
        ImageVector imageVector = _fiberDvr;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberDvr", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(17.5f, 10.5f, 2.0f, 1.0f, -2.0f);
        bv.m(n, -1.0f, 4.5f, 10.5f, 2.0f);
        r6.p(n, 3.0f, -2.0f, -3.0f);
        n.moveTo(23.0f, 3.0f);
        af0.m(n, 1.0f, 3.0f, 18.0f, 22.0f);
        uo.l(n, 23.0f, 3.0f, 8.0f, 13.5f);
        n.curveToRelative(0.0f, 0.85f, -0.65f, 1.5f, -1.5f, 1.5f);
        n.lineTo(3.0f, 15.0f);
        n.lineTo(3.0f, 9.0f);
        n.horizontalLineToRelative(3.5f);
        n.curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f);
        bv.m(n, 3.0f, 12.62f, 15.0f, -1.5f);
        n.lineTo(9.37f, 9.0f);
        n.horizontalLineToRelative(1.5f);
        n.lineToRelative(1.0f, 3.43f);
        n.lineToRelative(1.0f, -3.43f);
        uo.w(n, 1.5f, -1.75f, 6.0f);
        n.moveTo(21.0f, 12.9f);
        uo.n(n, -0.9f, 21.0f, 15.0f, -1.5f);
        n.lineToRelative(-0.85f, -2.0f);
        n.lineTo(17.5f, 13.0f);
        n.verticalLineToRelative(2.0f);
        n.lineTo(16.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 16.0f, 9.0f, 5.0f, 3.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberDvr = build;
        build.getClass();
        return build;
    }
}
