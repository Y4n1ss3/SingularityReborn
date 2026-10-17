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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MemoryKt {
    private static ImageVector _memory;

    public static final ImageVector getMemory(Icons.Filled filled) {
        ImageVector imageVector = _memory;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Memory", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(15.0f, 9.0f, 9.0f, 9.0f, 6.0f);
        gy.n(s, 6.0f, 15.0f, 9.0f);
        k4.C(s, 13.0f, 13.0f, -2.0f, -2.0f);
        fc.x(s, 2.0f, 2.0f, 21.0f, 11.0f);
        s.lineTo(21.0f, 9.0f);
        s.horizontalLineToRelative(-2.0f);
        s.lineTo(19.0f, 7.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        uo.n(s, -2.0f, 15.0f, 3.0f, -2.0f);
        uo.B(s, 2.0f, -2.0f, 11.0f, 3.0f);
        s.lineTo(9.0f, 3.0f);
        s.verticalLineToRelative(2.0f);
        s.lineTo(7.0f, 5.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        bv.q(s, 2.0f, 3.0f, 9.0f, 2.0f);
        bv.C(s, 2.0f, 2.0f, 3.0f, 13.0f);
        kf0.z(s, 2.0f, 2.0f, 2.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        af0.v(s, 2.0f, 2.0f, 2.0f, -2.0f);
        af0.v(s, 2.0f, 2.0f, 2.0f, -2.0f);
        s.horizontalLineToRelative(2.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        r6.D(s, -2.0f, 2.0f, -2.0f, -2.0f);
        kf0.C(s, -2.0f, 2.0f, 17.0f, 17.0f);
        s.lineTo(7.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(s, 7.0f, 7.0f, 10.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _memory = build;
        build.getClass();
        return build;
    }
}
