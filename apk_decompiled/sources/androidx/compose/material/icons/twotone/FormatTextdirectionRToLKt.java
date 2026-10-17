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
import defpackage.er;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatTextdirectionRToLKt {
    private static ImageVector _formatTextdirectionRToL;

    public static final ImageVector getFormatTextdirectionRToL(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatTextdirectionRToL;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatTextdirectionRToL", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 6.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(6.0f, 6.0f);
        b2.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        uo.B(b2, 5.0f, 2.0f, 12.0f, 4.0f);
        kf0.x(b2, 2.0f, 11.0f, 2.0f);
        b2.lineTo(16.0f, 4.0f);
        uo.n(b2, 2.0f, 18.0f, 2.0f, -8.0f);
        b2.curveTo(7.79f, 2.0f, 6.0f, 3.79f, 6.0f, 6.0f);
        b2.close();
        b2.moveTo(10.0f, 8.0f);
        b2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        r6.l(b2, 4.0f, 4.0f, 18.0f);
        r6.A(b2, 4.0f, 4.0f, -3.0f, 12.0f);
        b2.verticalLineToRelative(-2.0f);
        b2.lineTo(8.0f, 17.0f);
        b2.verticalLineToRelative(-3.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionRToL = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFormatTextdirectionRToL$annotations(Icons.TwoTone twoTone) {
    }
}
