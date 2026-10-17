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
import defpackage.bv;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlatwareKt {
    private static ImageVector _flatware;

    public static final ImageVector getFlatware(Icons.Sharp sharp) {
        ImageVector imageVector = _flatware;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Flatware", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 7.08f);
        b.curveToRelative(0.0f, 1.77f, -0.84f, 3.25f, -2.0f, 3.82f);
        uf.z(b, 21.0f, -2.0f, 10.9f);
        b.curveToRelative(-1.16f, -0.57f, -2.0f, -2.05f, -2.0f, -3.82f);
        b.curveTo(10.01f, 4.83f, 11.35f, 3.0f, 13.0f, 3.0f);
        b.curveTo(14.66f, 3.0f, 16.0f, 4.83f, 16.0f, 7.08f);
        uo.C(b, 17.0f, 3.0f, 18.0f, 2.0f);
        bv.x(b, -8.0f, 2.0f, 7.0f);
        b.curveTo(21.0f, 5.24f, 19.76f, 3.0f, 17.0f, 3.0f);
        uo.q(b, 8.28f, 3.0f, 7.56f, 4.0f);
        b.horizontalLineTo(6.72f);
        b.verticalLineTo(3.0f);
        b.lineTo(6.0f, 3.0f);
        kf0.u(b, 5.28f, 3.0f, 4.0f, 4.44f);
        b.verticalLineTo(3.0f);
        b.lineTo(3.72f, 3.0f);
        b.horizontalLineTo(3.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 0.0f, 0.9f, 0.0f, 2.0f, 0.0f);
        bv.x(b, 10.0f, 2.0f, 11.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.k(b, 3.0f, 8.28f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flatware = build;
        build.getClass();
        return build;
    }
}
