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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CopyAllKt {
    private static ImageVector _copyAll;

    public static final ImageVector getCopyAll(Icons.Filled filled) {
        ImageVector imageVector = _copyAll;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CopyAll", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 2.0f, 9.0f);
        d.curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(9.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f);
        c21.d(d, 18.0f, 16.0f, 9.0f, 4.0f);
        uo.r(d, 9.0f, 16.0f, 3.0f, 15.0f);
        fc.y(d, -2.0f, 2.0f, 2.0f, 3.0f);
        k4.C(d, 3.0f, 9.5f, 2.0f, 2.0f);
        bv.s(d, 3.0f, 9.5f, 10.0f, 20.0f);
        bv.l(d, 2.0f, 2.0f, -2.0f, 20.0f);
        bv.y(d, 3.0f, 18.5f, -2.0f, 2.0f);
        kf0.n(d, 2.0f, 3.0f, 5.0f, 22.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        uo.r(d, 2.0f, 22.0f, 8.5f, 22.0f);
        bv.l(d, -2.0f, -2.0f, 2.0f, 22.0f);
        d.moveTo(13.5f, 22.0f);
        d.lineTo(13.5f, 22.0f);
        r6.q(d, 0.0f, -2.0f, 2.0f, 0.0f);
        d.curveTo(15.5f, 21.1f, 14.6f, 22.0f, 13.5f, 22.0f);
        k4.r(d, 5.0f, 6.0f, 5.0f, 6.0f);
        j50.x(d, 0.0f, 2.0f, 3.0f, 0.0f);
        d.curveTo(3.0f, 6.9f, 3.9f, 6.0f, 5.0f, 6.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _copyAll = build;
        build.getClass();
        return build;
    }
}
