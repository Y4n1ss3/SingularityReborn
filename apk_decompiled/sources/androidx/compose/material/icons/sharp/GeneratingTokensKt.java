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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GeneratingTokensKt {
    private static ImageVector _generatingTokens;

    public static final ImageVector getGeneratingTokens(Icons.Sharp sharp) {
        ImageVector imageVector = _generatingTokens;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.GeneratingTokens", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        b.curveTo(17.0f, 7.58f, 13.42f, 4.0f, 9.0f, 4.0f);
        r6.B(b, 12.0f, 10.5f, -2.0f, 5.0f);
        uf.B(b, 8.0f, -5.0f, 6.0f, 9.0f);
        uo.r(b, 6.0f, 10.5f, 20.25f, 3.75f);
        b.lineTo(23.0f, 5.0f);
        b.lineToRelative(-2.75f, 1.25f);
        b.lineTo(19.0f, 9.0f);
        b.lineToRelative(-1.25f, -2.75f);
        b.lineTo(15.0f, 5.0f);
        b.lineToRelative(2.75f, -1.25f);
        r6.C(b, 19.0f, 1.0f, 20.25f, 3.75f);
        b.moveTo(20.25f, 17.75f);
        b.lineTo(23.0f, 19.0f);
        b.lineToRelative(-2.75f, 1.25f);
        b.lineTo(19.0f, 23.0f);
        b.lineToRelative(-1.25f, -2.75f);
        b.lineTo(15.0f, 19.0f);
        b.lineToRelative(2.75f, -1.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 19.0f, 15.0f, 20.25f, 17.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _generatingTokens = build;
        build.getClass();
        return build;
    }
}
