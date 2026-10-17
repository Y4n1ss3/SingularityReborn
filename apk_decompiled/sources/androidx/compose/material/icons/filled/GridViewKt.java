package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GridViewKt {
    private static ImageVector _gridView;

    public static final ImageVector getGridView(Icons.Filled filled) {
        ImageVector imageVector = _gridView;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GridView", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(3.0f, 3.0f, 8.0f, 8.0f);
        r6.C(m, 11.0f, 3.0f, 3.0f, 3.0f);
        m.moveTo(9.0f, 9.0f);
        m.lineTo(5.0f, 9.0f);
        r6.m(m, 5.0f, 5.0f, 4.0f, 4.0f);
        bv.y(m, 3.0f, 13.0f, 8.0f, 8.0f);
        kf0.t(m, -8.0f, 3.0f, 13.0f);
        m.moveTo(9.0f, 19.0f);
        af0.m(m, 5.0f, 19.0f, -4.0f, 4.0f);
        kp0.z(m, 4.0f, 13.0f, 3.0f, 8.0f);
        uf.C(m, 8.0f, 21.0f, 3.0f, -8.0f);
        m.moveTo(19.0f, 9.0f);
        uo.n(m, -4.0f, 15.0f, 5.0f, 4.0f);
        kp0.z(m, 4.0f, 13.0f, 13.0f, 8.0f);
        j50.n(m, 8.0f, -8.0f, -8.0f);
        k4.C(m, 19.0f, 19.0f, -4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(m, 4.0f, 4.0f), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridView = build;
        build.getClass();
        return build;
    }
}
