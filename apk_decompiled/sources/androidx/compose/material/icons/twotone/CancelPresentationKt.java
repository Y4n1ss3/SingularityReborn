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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CancelPresentationKt {
    private static ImageVector _cancelPresentation;

    public static final ImageVector getCancelPresentation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _cancelPresentation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CancelPresentation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(3.0f, 19.1f, 18.0f, 21.0f, 4.95f);
        r6.C(p, 3.0f, 4.95f, 3.0f, 19.1f);
        p.moveTo(8.0f, 9.36f);
        p.lineToRelative(1.41f, -1.41f);
        p.lineTo(12.0f, 10.54f);
        p.lineToRelative(2.59f, -2.59f);
        p.lineTo(16.0f, 9.36f);
        p.lineToRelative(-2.59f, 2.59f);
        p.lineTo(16.0f, 14.54f);
        p.lineToRelative(-1.41f, 1.41f);
        p.lineTo(12.0f, 13.36f);
        p.lineToRelative(-2.59f, 2.59f);
        p.lineTo(8.0f, 14.54f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(p, 2.59f, -2.59f, 8.0f, 9.36f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 3.0f, 3.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(18.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(23.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 21.0f, 19.0f, 3.0f, 19.0f);
        r6.m(i, 3.0f, 5.0f, 18.0f, 14.0f);
        i.moveTo(9.41f, 15.95f);
        i.lineTo(12.0f, 13.36f);
        i.lineToRelative(2.59f, 2.59f);
        i.lineTo(16.0f, 14.54f);
        i.lineToRelative(-2.59f, -2.59f);
        i.lineTo(16.0f, 9.36f);
        i.lineToRelative(-1.41f, -1.41f);
        i.lineTo(12.0f, 10.54f);
        i.lineTo(9.41f, 7.95f);
        i.lineTo(8.0f, 9.36f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 2.59f, 2.59f, 8.0f, 14.54f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cancelPresentation = build;
        build.getClass();
        return build;
    }
}
