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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchVideoKt {
    private static ImageVector _switchVideo;

    public static final ImageVector getSwitchVideo(Icons.TwoTone twoTone) {
        ImageVector imageVector = _switchVideo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwitchVideo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.0f, 17.0f, 12.0f, 16.0f, 7.0f);
        bv.r(p, 4.0f, 7.0f, 10.0f);
        bv.y(p, 8.0f, 9.0f, 2.0f, 4.0f);
        p.lineTo(12.0f, 9.0f);
        p.lineToRelative(3.0f, 3.0f);
        p.lineToRelative(-3.0f, 3.0f);
        bv.q(p, -2.0f, 8.0f, 13.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, -3.0f, -3.0f, 3.0f, -3.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(8.0f, 13.0f, 4.0f, 2.0f);
        b.lineToRelative(3.0f, -3.0f);
        b.lineToRelative(-3.0f, -3.0f);
        b.verticalLineToRelative(2.0f);
        b.lineTo(8.0f, 11.0f);
        b.lineTo(8.0f, 9.0f);
        fc.C(b, -3.0f, 3.0f, 3.0f, 3.0f);
        b.moveTo(18.0f, 9.5f);
        b.lineTo(18.0f, 6.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(3.0f, 5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(14.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        j50.A(b, -3.5f, 4.0f, 4.0f, -13.0f);
        fc.B(b, -4.0f, 4.0f, 16.0f, 17.0f);
        b.lineTo(4.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(b, 4.0f, 7.0f, 12.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchVideo = build;
        build.getClass();
        return build;
    }
}
