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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalPlayKt {
    private static ImageVector _localPlay;

    public static final ImageVector getLocalPlay(Icons.Sharp sharp) {
        ImageVector imageVector = _localPlay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LocalPlay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 12.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.lineTo(22.0f, 4.0f);
        b.lineTo(2.01f, 4.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(1.1f, 0.0f, 1.99f, 0.9f, 1.99f, 2.0f);
        b.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        kf0.z(b, 6.0f, 20.0f, -6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        k4.r(b, 15.58f, 16.8f, 12.0f, 14.5f);
        b.lineToRelative(-3.58f, 2.3f);
        b.lineToRelative(1.08f, -4.12f);
        b.lineToRelative(-3.29f, -2.69f);
        b.lineToRelative(4.24f, -0.25f);
        b.lineTo(12.0f, 5.8f);
        b.lineToRelative(1.54f, 3.95f);
        b.lineToRelative(4.24f, 0.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, -3.29f, 2.69f, 1.09f, 4.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPlay = build;
        build.getClass();
        return build;
    }
}
