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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoTransferKt {
    private static ImageVector _noTransfer;

    public static final ImageVector getNoTransfer(Icons.Sharp sharp) {
        ImageVector imageVector = _noTransfer;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NoTransfer", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.78f, 2.95f);
        b.curveTo(7.24f, 2.16f, 9.48f, 2.0f, 12.0f, 2.0f);
        b.curveToRelative(4.42f, 0.0f, 8.0f, 0.5f, 8.0f, 4.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 0.35f, -0.08f, 0.67f, -0.19f, 0.98f);
        fc.v(b, 13.83f, 11.0f, 18.0f, 6.0f);
        kf0.m(b, 8.83f, 5.78f, 2.95f);
        b.moveTo(19.78f, 22.61f);
        r6.w(b, 18.17f, 21.0f, 16.0f, -2.0f);
        af0.o(b, 8.0f, 2.0f, 5.0f, -2.78f);
        b.curveTo(4.39f, 17.67f, 4.0f, 16.88f, 4.0f, 16.0f);
        b.verticalLineTo(6.83f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(1.41f, -1.41f);
        gy.B(b, 18.38f, 18.38f, 19.78f, 22.61f);
        b.moveTo(9.0f, 15.5f);
        b.curveTo(9.0f, 14.67f, 8.33f, 14.0f, 7.5f, 14.0f);
        b.reflectiveCurveTo(6.0f, 14.67f, 6.0f, 15.5f);
        b.curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f);
        b.reflectiveCurveTo(9.0f, 16.33f, 9.0f, 15.5f);
        k4.r(b, 8.17f, 11.0f, 6.0f, 8.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(b, 11.0f, 8.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noTransfer = build;
        build.getClass();
        return build;
    }
}
