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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenShareKt {
    private static ImageVector _screenShare;

    public static final ImageVector getScreenShare(Icons.TwoTone twoTone) {
        ImageVector imageVector = _screenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 16.0f, 20.0f, 6.0f);
        i.lineTo(4.0f, 6.0f);
        kf0.t(i, 10.01f, 20.0f, 16.0f);
        i.moveTo(13.0f, 14.47f);
        i.verticalLineToRelative(-2.19f);
        i.curveToRelative(-2.78f, 0.0f, -4.61f, 0.85f, -6.0f, 2.72f);
        i.curveToRelative(0.56f, -2.67f, 2.11f, -5.33f, 6.0f, -5.87f);
        i.lineTo(13.0f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, 4.0f, 3.73f, -4.0f, 3.74f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 18.0f);
        b.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        b.lineTo(22.0f, 6.0f);
        b.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(4.0f, 4.0f);
        b.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        af0.m(b, 0.0f, 18.0f, 2.0f, 24.0f);
        kf0.C(b, -2.0f, -4.0f, 4.0f, 16.0f);
        fc.w(b, 4.0f, 6.0f, 16.0f, 10.01f);
        uo.l(b, 4.0f, 16.0f, 13.0f, 9.13f);
        b.curveToRelative(-3.89f, 0.54f, -5.44f, 3.2f, -6.0f, 5.87f);
        b.curveToRelative(1.39f, -1.87f, 3.22f, -2.72f, 6.0f, -2.72f);
        b.verticalLineToRelative(2.19f);
        b.lineToRelative(4.0f, -3.74f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(b, 13.0f, 7.0f, 2.13f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenShare = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getScreenShare$annotations(Icons.TwoTone twoTone) {
    }
}
