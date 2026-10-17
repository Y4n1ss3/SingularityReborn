package androidx.compose.material.icons.twotone;

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
import defpackage.er;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WrapTextKt {
    private static ImageVector _wrapText;

    public static final ImageVector getWrapText(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wrapText;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WrapText", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(4.0f, 17.0f, 6.0f, 2.0f);
        uo.l(b, 4.0f, 19.0f, 17.0f, 11.0f);
        af0.m(b, 4.0f, 11.0f, 2.0f, 13.25f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.lineTo(15.0f, 17.0f);
        b.verticalLineToRelative(-2.0f);
        b.lineToRelative(-3.0f, 3.0f);
        r6.A(b, 3.0f, 3.0f, -2.0f, 2.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        r6.B(b, 4.0f, 5.0f, 16.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 4.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wrapText = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getWrapText$annotations(Icons.TwoTone twoTone) {
    }
}
