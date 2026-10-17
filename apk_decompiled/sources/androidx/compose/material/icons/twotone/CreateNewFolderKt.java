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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CreateNewFolderKt {
    private static ImageVector _createNewFolder;

    public static final ImageVector getCreateNewFolder(Icons.TwoTone twoTone) {
        ImageVector imageVector = _createNewFolder;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CreateNewFolder", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.17f, 8.0f, -0.59f, -0.59f);
        r6.w(e, 9.17f, 6.0f, 4.0f, 12.0f);
        e.horizontalLineToRelative(16.0f);
        e.verticalLineTo(8.0f);
        e.horizontalLineToRelative(-8.83f);
        e.close();
        k4.C(e, 14.0f, 10.0f, 2.0f, 2.0f);
        af0.v(e, 2.0f, 2.0f, -2.0f, 2.0f);
        af0.v(e, -2.0f, -2.0f, -2.0f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(e, 2.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 6.0f, -8.0f, -2.0f, -2.0f);
        i.lineTo(4.0f, 4.0f);
        i.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        i.lineTo(22.0f, 8.0f);
        i.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 20.0f, 18.0f, 4.0f, 18.0f);
        i.lineTo(4.0f, 6.0f);
        i.horizontalLineToRelative(5.17f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(0.59f, 0.59f);
        bv.r(i, 20.0f, 8.0f, 10.0f);
        k4.C(i, 12.0f, 14.0f, 2.0f, 2.0f);
        af0.v(i, 2.0f, -2.0f, 2.0f, -2.0f);
        af0.v(i, -2.0f, -2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(i, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _createNewFolder = build;
        build.getClass();
        return build;
    }
}
