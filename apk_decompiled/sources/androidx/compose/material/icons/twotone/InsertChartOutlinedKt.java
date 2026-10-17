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
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InsertChartOutlinedKt {
    private static ImageVector _insertChartOutlined;

    public static final ImageVector getInsertChartOutlined(Icons.TwoTone twoTone) {
        ImageVector imageVector = _insertChartOutlined;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.InsertChartOutlined", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(9.0f, 17.0f, 7.0f, 17.0f, -7.0f);
        fc.x(s, 2.0f, 7.0f, 13.0f, 17.0f);
        uo.n(s, -2.0f, 11.0f, 7.0f, 2.0f);
        bv.m(s, 10.0f, 17.0f, 17.0f, -2.0f);
        r6.p(s, -4.0f, 2.0f, 4.0f);
        s.moveTo(19.0f, 19.0f);
        s.lineTo(5.0f, 19.0f);
        r6.m(s, 5.0f, 5.0f, 14.0f, 14.0f);
        s.moveTo(19.0f, 3.0f);
        s.lineTo(5.0f, 3.0f);
        s.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        s.verticalLineToRelative(14.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(14.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(21.0f, 5.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _insertChartOutlined = build;
        build.getClass();
        return build;
    }
}
