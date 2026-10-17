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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberDvrKt {
    private static ImageVector _fiberDvr;

    public static final ImageVector getFiberDvr(Icons.Filled filled) {
        ImageVector imageVector = _fiberDvr;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FiberDvr", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(17.5f, 10.5f, 2.0f, 1.0f, -2.0f);
        k4.D(n, 10.5f, 4.5f, 10.5f, 2.0f);
        k4.p(n, 3.0f, -2.0f, 10.5f);
        n.moveTo(21.0f, 3.0f);
        n.horizontalLineTo(3.0f);
        n.curveTo(1.89f, 3.0f, 1.0f, 3.89f, 1.0f, 5.0f);
        n.verticalLineToRelative(14.0f);
        n.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(18.0f);
        n.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.verticalLineTo(5.0f);
        n.curveTo(23.0f, 3.89f, 22.11f, 3.0f, 21.0f, 3.0f);
        n.close();
        n.moveTo(8.0f, 13.5f);
        n.curveTo(8.0f, 14.35f, 7.35f, 15.0f, 6.5f, 15.0f);
        uf.t(n, 3.0f, 9.0f, 3.5f);
        n.curveTo(7.35f, 9.0f, 8.0f, 9.65f, 8.0f, 10.5f);
        k4.D(n, 13.5f, 12.62f, 15.0f, -1.5f);
        n.lineTo(9.37f, 9.0f);
        n.horizontalLineToRelative(1.5f);
        n.lineToRelative(1.0f, 3.43f);
        n.lineToRelative(1.0f, -3.43f);
        gy.n(n, 1.5f, 12.62f, 15.0f);
        n.moveTo(21.0f, 11.5f);
        n.curveToRelative(0.0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f);
        n.lineTo(21.0f, 15.0f);
        r6.t(n, -1.5f, -0.85f, -2.0f, 17.5f);
        kf0.w(n, 2.0f, 16.0f, 9.0f, 3.5f);
        n.curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(n, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberDvr = build;
        build.getClass();
        return build;
    }
}
