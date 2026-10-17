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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrokenImageKt {
    private static ImageVector _brokenImage;

    public static final ImageVector getBrokenImage(Icons.TwoTone twoTone) {
        ImageVector imageVector = _brokenImage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BrokenImage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.99f, 15.41f, -4.0f, -4.0f);
        e.lineToRelative(-4.0f, 4.0f);
        fc.u(e, -0.99f, -0.99f, 19.0f, 14.0f);
        uo.t(e, -6.57f, -1.01f, -1.01f);
        e.moveTo(5.0f, 11.59f);
        e.lineToRelative(0.99f, 1.0f);
        e.lineToRelative(4.0f, -4.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(4.0f, -4.01f);
        e.lineTo(19.0f, 9.59f);
        e.verticalLineTo(5.0f);
        e.horizontalLineTo(5.0f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 19.0f, 19.0f, 5.0f, 19.0f);
        i.verticalLineToRelative(-4.58f);
        i.lineToRelative(0.99f, 0.99f);
        i.lineToRelative(4.0f, -4.0f);
        i.lineToRelative(4.0f, 4.0f);
        i.lineToRelative(4.0f, -3.99f);
        r6.C(i, 19.0f, 12.43f, 19.0f, 19.0f);
        i.moveTo(19.0f, 9.59f);
        i.lineToRelative(-1.01f, -1.01f);
        i.lineToRelative(-4.0f, 4.01f);
        i.lineToRelative(-4.0f, -4.0f);
        i.lineToRelative(-4.0f, 4.0f);
        i.lineToRelative(-0.99f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i, 5.0f, 5.0f, 14.0f, 4.59f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brokenImage = build;
        build.getClass();
        return build;
    }
}
