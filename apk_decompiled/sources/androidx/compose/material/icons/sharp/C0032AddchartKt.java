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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* renamed from: androidx.compose.material.icons.sharp.AddchartKt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032AddchartKt {
    private static ImageVector _addchart;

    public static final ImageVector getAddchart(Icons.Sharp sharp) {
        ImageVector imageVector = _addchart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Addchart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 9.0f, 2.0f, 8.0f, -2.0f);
        kf0.D(n, 9.0f, 9.0f, 17.0f, -6.0f);
        fc.j(n, 7.0f, 6.0f, 9.0f);
        uo.p(n, 19.0f, 19.0f, 5.0f, 5.0f);
        af0.p(n, 6.0f, 3.0f, 3.0f, 18.0f);
        bv.l(n, 18.0f, -8.0f, -2.0f, 19.0f);
        bv.y(n, 15.0f, 13.0f, 4.0f, 2.0f);
        kf0.n(n, -4.0f, 15.0f, 19.0f, 5.0f);
        uf.p(n, 2.0f, -2.0f, 3.0f, -3.0f);
        r6.D(n, 2.0f, 3.0f, 3.0f, 2.0f);
        n.verticalLineTo(7.0f);
        n.horizontalLineToRelative(3.0f);
        n.verticalLineTo(5.0f);
        n.horizontalLineTo(19.0f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addchart = build;
        build.getClass();
        return build;
    }
}
