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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CabinKt {
    private static ImageVector _cabin;

    public static final ImageVector getCabin(Icons.Sharp sharp) {
        ImageVector imageVector = _cabin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Cabin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.0f, 1.0f);
        b.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        b.curveTo(6.45f, 4.0f, 6.0f, 4.45f, 6.0f, 5.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        k4.w(b, 10.0f, 12.0f, 3.0f);
        uf.u(b, 6.0f, 7.58f, 6.0f, 4.0f);
        b.verticalLineToRelative(3.11f);
        b.lineTo(1.0f, 11.4f);
        b.lineToRelative(1.21f, 1.59f);
        fc.t(b, 4.0f, 11.62f, 21.0f, 16.0f);
        b.verticalLineToRelative(-9.38f);
        b.lineToRelative(1.79f, 1.36f);
        r6.C(b, 23.0f, 11.4f, 12.0f, 3.0f);
        b.moveTo(13.94f, 7.0f);
        b.horizontalLineToRelative(-3.89f);
        r6.C(b, 12.0f, 5.52f, 13.94f, 7.0f);
        b.moveTo(7.44f, 9.0f);
        fc.s(b, 9.12f, 18.0f, 10.1f, 11.0f);
        b.horizontalLineTo(6.0f);
        b.verticalLineToRelative(-0.9f);
        b.lineTo(7.44f, 9.0f);
        b.close();
        uf.D(b, 18.0f, 13.0f, 2.0f, 6.0f);
        kf0.n(b, -2.0f, 18.0f, 6.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(b, -2.0f, 12.0f, 2.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cabin = build;
        build.getClass();
        return build;
    }
}
