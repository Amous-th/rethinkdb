// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/TopLevel.java

package com.rethinkdb.gen.model;

import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.gen.ast.Error;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.Util;
import com.rethinkdb.gen.exc.ReqlDriverError;

import java.util.Arrays;
import java.util.List;

public class TopLevel {

    public ReqlExpr expr(Object value){
        return Util.toReqlExpr(value);
    }

    public ReqlExpr row(Object... values) {
        throw new ReqlDriverError("r.row is not implemented in the Java driver."+
                                  " Use lambda syntax instead");
    }

    public MapObject hashMap(String key, Object val){
        return new MapObject().with(key, val);
    }

    public List array(Object... vals){
        return Arrays.asList(vals);
    }

    public Javascript js(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Javascript(args);
    }
    public Uuid uuid(){
        Arguments args = new Arguments();
        return new Uuid(args);
    }
    public Http http(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Http(args);
    }
    public Error error(){
        Arguments args = new Arguments();
        return new Error(args);
    }
    public Error error(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Error(args);
    }
    public Db db(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Db(args);
    }
    public Table table(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Table(args);
    }
    public Table table(Db db, Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(db);
        args.coerceAndAdd(expr);
        return new Table(args);
    }
    public Eq eq(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Eq(args);
    }
    public Ne ne(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Ne(args);
    }
    public Lt lt(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Lt(args);
    }
    public Le le(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Le(args);
    }
    public Gt gt(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Gt(args);
    }
    public Ge ge(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Ge(args);
    }
    public Not not(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Not(args);
    }
    public Add add(Object expr, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAddAll(exprs);
        return new Add(args);
    }
    public Sub sub(Object expr, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAddAll(exprs);
        return new Sub(args);
    }
    public Mul mul(Object expr, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAddAll(exprs);
        return new Mul(args);
    }
    public Div div(Object expr, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAddAll(exprs);
        return new Div(args);
    }
    public Mod mod(Object expr, Object exprA){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        return new Mod(args);
    }
    public Floor floor(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Floor(args);
    }
    public Ceil ceil(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Ceil(args);
    }
    public Round round(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Round(args);
    }
    public ReqlObject object(Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAddAll(exprs);
        return new ReqlObject(args);
    }
    public Map map(Object expr, ReqlFunction1 func1){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(func1);
        return new Map(args);
    }
    public Map map(Object expr, Object exprA, ReqlFunction2 func2){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(func2);
        return new Map(args);
    }
    public Map map(Object expr, Object exprA, Object exprB, ReqlFunction3 func3){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        args.coerceAndAdd(func3);
        return new Map(args);
    }
    public Map map(Object expr, Object exprA, Object exprB, Object exprC, ReqlFunction4 func4){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        args.coerceAndAdd(exprC);
        args.coerceAndAdd(func4);
        return new Map(args);
    }
    public Union union(Object expr, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAddAll(exprs);
        return new Union(args);
    }
    public Range range(){
        Arguments args = new Arguments();
        return new Range(args);
    }
    public Range range(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Range(args);
    }
    public Range range(Object expr, Object exprA){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        return new Range(args);
    }
    public TypeOf typeOf(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new TypeOf(args);
    }
    public DbCreate dbCreate(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new DbCreate(args);
    }
    public DbDrop dbDrop(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new DbDrop(args);
    }
    public DbList dbList(){
        Arguments args = new Arguments();
        return new DbList(args);
    }
    public TableCreate tableCreate(Db db, Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(db);
        args.coerceAndAdd(expr);
        return new TableCreate(args);
    }
    public TableDrop tableDrop(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new TableDrop(args);
    }
    public TableDrop tableDrop(Db db, Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(db);
        args.coerceAndAdd(expr);
        return new TableDrop(args);
    }
    public TableList tableList(Db db){
        Arguments args = new Arguments();
        args.coerceAndAdd(db);
        return new TableList(args);
    }
    public Wait wait_(){
        Arguments args = new Arguments();
        return new Wait(args);
    }
    public Wait wait_(Table table){
        Arguments args = new Arguments();
        args.coerceAndAdd(table);
        return new Wait(args);
    }
    public Wait wait_(Db db){
        Arguments args = new Arguments();
        args.coerceAndAdd(db);
        return new Wait(args);
    }
    public Reconfigure reconfigure(){
        Arguments args = new Arguments();
        return new Reconfigure(args);
    }
    public Reconfigure reconfigure(Table table){
        Arguments args = new Arguments();
        args.coerceAndAdd(table);
        return new Reconfigure(args);
    }
    public Reconfigure reconfigure(Db db){
        Arguments args = new Arguments();
        args.coerceAndAdd(db);
        return new Reconfigure(args);
    }
    public Rebalance rebalance(){
        Arguments args = new Arguments();
        return new Rebalance(args);
    }
    public Rebalance rebalance(Db db){
        Arguments args = new Arguments();
        args.coerceAndAdd(db);
        return new Rebalance(args);
    }
    public Rebalance rebalance(Table table){
        Arguments args = new Arguments();
        args.coerceAndAdd(table);
        return new Rebalance(args);
    }
    public Funcall do_(Object expr, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAddAll(exprs);
        return new Funcall(args);
    }
    public Funcall do_(Object expr, ReqlFunction1 func1){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(func1);
        return new Funcall(args);
    }
    public Funcall do_(Object expr, Object exprA, ReqlFunction2 func2){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(func2);
        return new Funcall(args);
    }
    public Funcall do_(Object expr, Object exprA, Object exprB, ReqlFunction3 func3){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        args.coerceAndAdd(func3);
        return new Funcall(args);
    }
    public Funcall do_(Object expr, Object exprA, Object exprB, Object exprC, ReqlFunction4 func4){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        args.coerceAndAdd(exprC);
        args.coerceAndAdd(func4);
        return new Funcall(args);
    }
    public Branch branch(Object expr, Object exprA, Object exprB){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        return new Branch(args);
    }
    public Or or(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Or(args);
    }
    public And and(Object expr, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAddAll(exprs);
        return new And(args);
    }
    public Asc asc(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Asc(args);
    }
    public Desc desc(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Desc(args);
    }
    public Info info(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Info(args);
    }
    public Json json(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Json(args);
    }
    public Iso8601 iso8601(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Iso8601(args);
    }
    public EpochTime epochTime(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new EpochTime(args);
    }
    public Now now(){
        Arguments args = new Arguments();
        return new Now(args);
    }
    public Time time(Object expr, Object exprA, Object exprB, Object exprC){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        args.coerceAndAdd(exprC);
        return new Time(args);
    }
    public Time time(Object expr, Object exprA, Object exprB, Object exprC, Object exprD, Object exprE, Object exprF){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        args.coerceAndAdd(exprC);
        args.coerceAndAdd(exprD);
        args.coerceAndAdd(exprE);
        args.coerceAndAdd(exprF);
        return new Time(args);
    }
    public Monday monday(){
        Arguments args = new Arguments();
        return new Monday(args);
    }
    public Tuesday tuesday(){
        Arguments args = new Arguments();
        return new Tuesday(args);
    }
    public Wednesday wednesday(){
        Arguments args = new Arguments();
        return new Wednesday(args);
    }
    public Thursday thursday(){
        Arguments args = new Arguments();
        return new Thursday(args);
    }
    public Friday friday(){
        Arguments args = new Arguments();
        return new Friday(args);
    }
    public Saturday saturday(){
        Arguments args = new Arguments();
        return new Saturday(args);
    }
    public Sunday sunday(){
        Arguments args = new Arguments();
        return new Sunday(args);
    }
    public January january(){
        Arguments args = new Arguments();
        return new January(args);
    }
    public February february(){
        Arguments args = new Arguments();
        return new February(args);
    }
    public March march(){
        Arguments args = new Arguments();
        return new March(args);
    }
    public April april(){
        Arguments args = new Arguments();
        return new April(args);
    }
    public May may(){
        Arguments args = new Arguments();
        return new May(args);
    }
    public June june(){
        Arguments args = new Arguments();
        return new June(args);
    }
    public July july(){
        Arguments args = new Arguments();
        return new July(args);
    }
    public August august(){
        Arguments args = new Arguments();
        return new August(args);
    }
    public September september(){
        Arguments args = new Arguments();
        return new September(args);
    }
    public October october(){
        Arguments args = new Arguments();
        return new October(args);
    }
    public November november(){
        Arguments args = new Arguments();
        return new November(args);
    }
    public December december(){
        Arguments args = new Arguments();
        return new December(args);
    }
    public Literal literal(){
        Arguments args = new Arguments();
        return new Literal(args);
    }
    public Literal literal(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Literal(args);
    }
    public Random random(){
        Arguments args = new Arguments();
        return new Random(args);
    }
    public Random random(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Random(args);
    }
    public Random random(Object expr, Object exprA){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        return new Random(args);
    }
    public Args args(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Args(args);
    }
    public Binary binary(Object expr){
        
        if(expr instanceof byte[]){
            return new Binary((byte[]) expr);
        }else{
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Binary(args);
        }
    }
    public Geojson geojson(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Geojson(args);
    }
    public Point point(Object expr, Object exprA){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        return new Point(args);
    }
    public Line line(Object expr, Object exprA, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAddAll(exprs);
        return new Line(args);
    }
    public Polygon polygon(Object expr, Object exprA, Object exprB, Object... exprs){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        args.coerceAndAddAll(exprs);
        return new Polygon(args);
    }
    public Distance distance(Object expr, Object exprA){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        return new Distance(args);
    }
    public Intersects intersects(Object expr, Object exprA){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        return new Intersects(args);
    }
    public Circle circle(Object expr){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        return new Circle(args);
    }
    public Circle circle(Object expr, Object exprA){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        return new Circle(args);
    }
    public Circle circle(Object expr, Object exprA, Object exprB){
        Arguments args = new Arguments();
        args.coerceAndAdd(expr);
        args.coerceAndAdd(exprA);
        args.coerceAndAdd(exprB);
        return new Circle(args);
    }
    public Minval minval(){
        Arguments args = new Arguments();
        return new Minval(args);
    }
    public Maxval maxval(){
        Arguments args = new Arguments();
        return new Maxval(args);
    }
}
