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
import defpackage.er;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatListBulletedKt {
    private static ImageVector _formatListBulleted;

    public static final ImageVector getFormatListBulleted(Icons.Sharp sharp) {
        ImageVector imageVector = _formatListBulleted;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatListBulleted", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 10.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        b.close();
        b.moveTo(4.0f, 4.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.reflectiveCurveTo(3.17f, 7.5f, 4.0f, 7.5f);
        b.reflectiveCurveTo(5.5f, 6.83f, 5.5f, 6.0f);
        b.reflectiveCurveTo(4.83f, 4.5f, 4.0f, 4.5f);
        b.close();
        b.moveTo(4.0f, 16.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f);
        b.reflectiveCurveToRelative(0.68f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(1.5f, -0.68f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        r6.B(b, 7.0f, 19.0f, 14.0f, -2.0f);
        bv.r(b, 7.0f, 17.0f, 2.0f);
        k4.C(b, 7.0f, 13.0f, 14.0f, -2.0f);
        bv.r(b, 7.0f, 11.0f, 2.0f);
        bv.y(b, 7.0f, 5.0f, 2.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 21.0f, 5.0f, 7.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatListBulleted = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFormatListBulleted$annotations(Icons.Sharp sharp) {
    }
}
