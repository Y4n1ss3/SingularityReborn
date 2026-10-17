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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.Sharp sharp) {
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FiberNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(22.0f, 4.0f, 2.0f, 4.0f, 16.0f);
        gy.n(s, 20.0f, 22.0f, 4.0f);
        s.moveTo(8.5f, 15.0f);
        s.lineTo(7.3f, 15.0f);
        s.lineToRelative(-2.55f, -3.5f);
        s.lineTo(4.75f, 15.0f);
        s.lineTo(3.5f, 15.0f);
        s.lineTo(3.5f, 9.0f);
        s.horizontalLineToRelative(1.25f);
        s.lineToRelative(2.5f, 3.5f);
        s.lineTo(7.25f, 9.0f);
        bv.r(s, 8.5f, 9.0f, 6.0f);
        s.moveTo(13.5f, 10.26f);
        af0.m(s, 11.0f, 10.26f, 1.12f, 2.5f);
        bv.q(s, 1.26f, 11.0f, 12.64f, 1.11f);
        uo.n(s, 2.5f, 13.5f, 15.0f, -4.0f);
        r6.m(s, 9.5f, 9.0f, 4.0f, 1.26f);
        s.moveTo(20.5f, 15.0f);
        uo.n(s, -6.0f, 14.5f, 9.0f, 1.25f);
        uo.B(s, 4.51f, 1.13f, 16.88f, 9.99f);
        kf0.x(s, 1.25f, 3.51f, 1.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(s, 19.25f, 9.0f, 1.25f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = build;
        build.getClass();
        return build;
    }
}
