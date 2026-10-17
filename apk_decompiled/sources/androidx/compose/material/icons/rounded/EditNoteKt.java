package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditNoteKt {
    private static ImageVector _editNote;

    public static final ImageVector getEditNote(Icons.Rounded rounded) {
        ImageVector imageVector = _editNote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EditNote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.0f, 11.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(9.0f);
        b.curveTo(13.55f, 10.0f, 14.0f, 10.45f, 14.0f, 11.0f);
        b.close();
        b.moveTo(3.0f, 7.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(9.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f);
        b.close();
        b.moveTo(10.0f, 15.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(5.0f);
        b.curveTo(9.55f, 16.0f, 10.0f, 15.55f, 10.0f, 15.0f);
        k4.x(b, 18.01f, 12.87f, 0.71f, -0.71f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(0.71f, 0.71f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        gy.B(b, -0.71f, 0.71f, 18.01f, 12.87f);
        b.moveTo(17.3f, 13.58f);
        b.lineToRelative(-5.16f, 5.16f);
        b.curveTo(12.05f, 18.83f, 12.0f, 18.95f, 12.0f, 19.09f);
        b.verticalLineToRelative(1.41f);
        b.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        b.horizontalLineToRelative(1.41f);
        b.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 5.16f, -5.16f, 17.3f, 13.58f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editNote = build;
        build.getClass();
        return build;
    }
}
