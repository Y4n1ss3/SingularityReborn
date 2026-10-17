package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TooltipCaretShape implements Shape {
    private final Shape caretShape;
    private final Shape tooltipShape;
    private final MutableState<Matrix> transformationMatrix;
    private final Path tooltipPath = AndroidPath_androidKt.Path();
    private final Path combinedPath = AndroidPath_androidKt.Path();
    private final Path caretPath = AndroidPath_androidKt.Path();

    public TooltipCaretShape(MutableState<Matrix> mutableState, Shape shape, Shape shape2) {
        this.transformationMatrix = mutableState;
        this.tooltipShape = shape;
        this.caretShape = shape2;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
        this.tooltipPath.reset();
        this.combinedPath.reset();
        this.caretPath.reset();
        Outline mo283createOutlinePq9zytI = this.tooltipShape.mo283createOutlinePq9zytI(j, layoutDirection, density);
        Outline mo283createOutlinePq9zytI2 = this.caretShape.mo283createOutlinePq9zytI(j, layoutDirection, density);
        if (mo283createOutlinePq9zytI instanceof Outline.Generic) {
            Path.m5045addPathUv8p0NA$default(this.tooltipPath, ((Outline.Generic) mo283createOutlinePq9zytI).getPath(), 0L, 2, null);
        } else if (mo283createOutlinePq9zytI instanceof Outline.Rounded) {
            Path.addRoundRect$default(this.tooltipPath, ((Outline.Rounded) mo283createOutlinePq9zytI).getRoundRect(), null, 2, null);
        } else {
            if (!(mo283createOutlinePq9zytI instanceof Outline.Rectangle)) {
                defpackage.o.n();
                return null;
            }
            Path.addRect$default(this.tooltipPath, ((Outline.Rectangle) mo283createOutlinePq9zytI).getRect(), null, 2, null);
        }
        if (mo283createOutlinePq9zytI2 instanceof Outline.Generic) {
            Path.m5045addPathUv8p0NA$default(this.caretPath, ((Outline.Generic) mo283createOutlinePq9zytI2).getPath(), 0L, 2, null);
        } else if (mo283createOutlinePq9zytI2 instanceof Outline.Rounded) {
            Path.addRoundRect$default(this.caretPath, ((Outline.Rounded) mo283createOutlinePq9zytI2).getRoundRect(), null, 2, null);
        } else {
            if (!(mo283createOutlinePq9zytI2 instanceof Outline.Rectangle)) {
                defpackage.o.n();
                return null;
            }
            Path.addRect$default(this.caretPath, ((Outline.Rectangle) mo283createOutlinePq9zytI2).getRect(), null, 2, null);
        }
        this.caretPath.mo4652transform58bKbWc(this.transformationMatrix.getValue().m5028unboximpl());
        this.combinedPath.mo4650opN5in7k0(this.tooltipPath, this.caretPath, PathOperation.Companion.m5070getUnionb3I0S0c());
        return new Outline.Generic(this.combinedPath);
    }

    public final Path getCaretPath() {
        return this.caretPath;
    }

    public final Path getCombinedPath() {
        return this.combinedPath;
    }

    public final Path getTooltipPath() {
        return this.tooltipPath;
    }
}
